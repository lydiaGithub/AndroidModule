package debug;

import android.util.Log;

import com.guiying.module.common.base.BaseApplication;
import com.guiying.module.common.base.IApplicationDelegate;
import com.guiying.module.common.http.DataType;
import com.guiying.module.common.http.HttpClient;
import com.guiying.module.common.http.OnResultListener;
import com.guiying.module.news.Constants;
import com.guiying.module.news.data.bean.StoryList;
import com.orhanobut.logger.Logger;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.ConstPool;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.StringMemberValue;

/**
 * <p>类说明</p>
 *
 * @author 张华洋 2017/2/15 20:11
 * @version V1.2.0
 * @name NewsApplication
 */
public class NewsApplication extends BaseApplication implements IApplicationDelegate{

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("LDY", "onCreate: 模块信息");

//        try {
//            ClassPool pool = ClassPool.getDefault();
//            //获取要修改的类的所有信息
//            CtClass ct = pool.getCtClass("debug.NewsApplication");
//            System.out.println("属性名称1111===" + ct.getClassFile().getAttributes());
//            //获取类中的方法
//            CtMethod[] cms = ct.getDeclaredMethods();
//            //获取第一个方法（因为只有一个方法）
//            //CtMethod cm = cms[0];
//            //System.out.println("方法名称====" + cm.getName());
//            //获取方法信息
//            //MethodInfo methodInfo = cm.getMethodInfo();
//            ConstPool cp = ct.getClassFile().getConstPool();
//            //获取注解信息
//            AnnotationsAttribute attribute2 = new AnnotationsAttribute(cp, AnnotationsAttribute.visibleTag);
//            Annotation annotation = new Annotation("com.alibaba.android.arouter.facade.annotation.Route", cp);
//            //修改名称为unitName的注解
//            annotation.addMemberValue("path", new StringMemberValue("/a/b", cp));
//            attribute2.setAnnotation(annotation);
//            //ct.getClassFile().addAttribute(attribute2);
//            System.out.println("属性名称===" + ct.getClassFile().getAttributes());
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        //login();
    }


    /**
     * 在这里模拟登陆，然后拿到sessionId或者Token
     * 这样就能够在组件请求接口了
     */
    private void login() {
        HttpClient client = new HttpClient.Builder()
                .baseUrl(Constants.ZHIHU_DAILY_BEFORE_MESSAGE)
                .url("20170419")
                .bodyType(DataType.JSON_OBJECT, StoryList.class)
                .build();
        client.get(new OnResultListener<StoryList>() {

            @Override
            public void onSuccess(StoryList result) {
                Logger.e(result.toString());
            }

            @Override
            public void onError(int code, String message) {
                Logger.e(message);
            }

            @Override
            public void onFailure(String message) {
                Logger.e(message);
            }
        });
    }

}
