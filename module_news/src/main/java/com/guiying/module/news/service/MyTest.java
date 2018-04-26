package com.guiying.module.news.service;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.ConstPool;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.StringMemberValue;

/**
 * Created by mac on 2018/4/26.
 */

public class MyTest {
    public static void main(String[] args){
            try {
                ClassPool pool = ClassPool.getDefault();
                //获取要修改的类的所有信息
                CtClass ct = pool.get("com.guiying.module.news.service.NewUtils");
                //获取类中的方法
                CtMethod[] cms = ct.getDeclaredMethods();
                //获取第一个方法（因为只有一个方法）
                CtMethod cm = cms[0];
                System.out.println("方法名称====" + cm.getName());
                //获取方法信息
                MethodInfo methodInfo = cm.getMethodInfo();
                //获取类里的em属性
                //CtField cf = ct.getField("em");
                //获取属性信息
                //FieldInfo fieldInfo = cf.getFieldInfo();

                ConstPool cp = ct.getClassFile().getConstPool();
                //获取注解信息
                AnnotationsAttribute attribute2 = new AnnotationsAttribute(cp, AnnotationsAttribute.visibleTag);
                Annotation annotation = new Annotation("com.alibaba.android.arouter.facade.annotation.Route", cp);

                //修改名称为unitName的注解
                annotation.addMemberValue("path", new StringMemberValue("/a/b", cp));
                attribute2.setAnnotation(annotation);
                ct.getClassFile().addAttribute(attribute2);
                System.out.println("属性名称===" + ct.getClassFile().getAttributes());

//                //获取注解属性
//                AnnotationsAttribute attribute = (AnnotationsAttribute) fieldInfo.getAttribute(AnnotationsAttribute.visibleTag);
//                System.out.println(attribute);
//                //获取注解
//                Annotation annotation = attribute.getAnnotation("javax.persistence.PersistenceContext");
//                System.out.println(annotation);
//                //获取注解的值
//                String text = ((StringMemberValue) annotation.getMemberValue("unitName")).getValue();
//                System.out.println("注解名称===" + text);
            }catch (Exception e){
                e.printStackTrace();
            }
    }
}
