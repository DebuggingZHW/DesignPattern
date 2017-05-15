package com.hw.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//原型模式，将一个对象作为原型，对其进行复制、克隆，产生一个与原对象类似的新对象
public class Prototype implements Cloneable{
	//private static final long serialVersionUID = 1L;
	private String string;
	private SerializableObject obj;
	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	//浅复制，重写clone方法
	public Object clone() throws CloneNotSupportedException {
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}
	
	//深复制
	public Object deepClone() throws IOException,ClassNotFoundException {
		//写入当前对象的二进制流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		//读出二进制流产生的新对象
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
}

class ConcretePrototype extends Prototype {
	public void show() {
		System.out.println("This is a prototype.");
	}
}

class SerializableObject implements Serializable {
	private static final long serialVersionUID = 1L;
}
