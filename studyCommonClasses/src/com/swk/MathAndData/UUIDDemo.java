package com.swk.MathAndData;
import java.util.UUID;

public class UUIDDemo {
	public static void main(String[] args) {
		
		/**
		 * UUID:UUID类:用唯一标识符 (UUID) 的类。 UUID 表示一个 128 位的值。
		 * 可以用来做数据库的主键;
		 */

		UUID uuid = UUID.randomUUID();
		String uid = uuid.toString();
		
		System.out.println(uid);
	}
}
