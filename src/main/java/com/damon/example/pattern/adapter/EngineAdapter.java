package com.damon.example.pattern.adapter;

public class EngineAdapter implements MyBatisEngine {
	
	private JDBCEngine engine;
	
	public EngineAdapter(JDBCEngine engine) {
		this.engine = engine;
	}

	@Override
	public void accessDB() {
		engine.access();
	}
}
