package com.damon.example.pattern.adapter;

public class Main {

	public static void main(String[] args) {
		JDBCEngine jdbcEngine = new JDBCEngine();
		MyBatisEngine engine = new EngineAdapter(jdbcEngine);
		engine.accessDB();
	}

}
