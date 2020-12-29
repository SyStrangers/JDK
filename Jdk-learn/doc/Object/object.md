##Object

Object 所有类的根节点
```java
public class Object{
    //类首次加载时执行的
    private static native void registerNatives();
    
    //final 修饰 不可被重写
    //功能: 返回当前对象的class 
    //用于进行反射操作,进行动态加载指定类等操作
    public final native Class<?> getClass();
    
    //返回此对象的hashcode
    //每一个不同的对象都会生成不同的hashcode
    public native int hashCode();
    
    //比较两个对象是否相等 没重写equlas 方法时  比较的是两个对象的地址
    public boolean equals(Object obj) {
        return (this == obj);
    }

    //创建该对象的副本 需要实现Cloneable
    protected native Object clone() throws CloneNotSupportedException;
    
    //以字符串输出该对象
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    
    //唤醒正在等待对象监视器的单个线程
    public final native void notify();

    //唤醒正在等待该对象监视器的所有线程
    public final native void notifyAll();

    //暂停当前线程 
    //直到调用notify()或者notifyAll()方法 或 等待时间已过
    //timeout 等待时间(毫秒)
    public final native void wait(long timeout) throws InterruptedException;
}
 

```
