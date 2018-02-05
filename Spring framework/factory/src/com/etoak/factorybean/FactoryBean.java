package com.etoak.factorybean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class FactoryBean {
	
	//简单模拟Spring ioc容器
	public static Object getBean(String id) throws Exception{
		
		//创建SAXReader对象
		SAXReader reader = new SAXReader();
		//读取src下beans.xml配置文件 进行解析
		Document doc = reader.read("src/beans.xml");
		//获取根节点 beans元素
		Element root = doc.getRootElement();
		if(root == null){
			return null;
		}
		//获取根元素下子元素bean
		List<Element> beans = root.elements("bean");
		//判断bean元素是否存在
		if(beans != null && beans.size() > 0){
			//遍历bean元素
			for(Element bean : beans){
				//获取bean元素属性id
				String beanId = bean.attributeValue("id");
				//判断bean元素属性id是否和参数id是否相等
				if(beanId != null && beanId.equals(id)){
					//获取bean元素属性class
					String beanObj = bean.attributeValue("class");
					//通过反射获取实例对象
					Class clazz = Class.forName(beanObj);
					//创建实例对象  new
					Object obj = clazz.newInstance();
					
					//获取bean元素下子元素property
					List<Element> properties = bean.elements("property");
					//判断property元素是否存在
					if(properties != null && properties.size() > 0){
						//遍历property元素
						for(Element property : properties){
							//获取property元素属性name
							String pName = property.attributeValue("name");
							String pValue = property.attributeValue("value");
							
							//id name age 
							//setId  setName setAge
							String methodName = "set" 
							                    + pName.substring(0, 1).toUpperCase()
							                    + pName.substring(1);
							//获取字段  id（String） name（String） age（Integer）  
							Field field = clazz.getDeclaredField(pName);System.out.println(field);
							//获取字段类型 id String.class  name String.class age Integer.class
							Class fieldType = field.getType();
							//获取字段名称 java.lang.String(String) java.lang.Integer(Integer)
							String fieldName = fieldType.getSimpleName();
							
							//参数值转换
							Object v = null;
							if("String".equals(fieldName)){
								v = pValue;
							}else if("int".equals(fieldName) || 
									"Integer".equals(fieldName)){
								v = Integer.parseInt(pValue);
							}
							
							//给哪个对象（obj）哪个方法（name）
							//什么参数类型（parameterTypes）
							//赋值（args）
							Method method =
									clazz.getMethod(methodName, fieldType);
							method.invoke(obj, v); 
							
						}
					}
					return obj;
				}
			}
		}
		
		return null;
	}

}
