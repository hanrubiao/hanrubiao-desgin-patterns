package anytxn.jrx.trick.tst;

import anytxn.jrx.trick.observe.service.impl.ObserverImpl;
import anytxn.jrx.trick.observe.service.impl.SubjectImpl;

/**
 * @ClassName ObserverTst.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月06日 00:27:00
 */
public class ObserverTst {

    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        //创建3个观察者
        new ObserverImpl(subject);
        new ObserverImpl(subject);
        new ObserverImpl(subject);
        //改变消息内容
        subject.setMsg("观察者模式发送消息");
    }
}
