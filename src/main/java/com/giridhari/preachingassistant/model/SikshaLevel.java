package com.giridhari.preachingassistant.model;

public enum SikshaLevel {
	NEW("New"),
	VISITOR("Visitor"),
	SHRADHAVAN("Shradhavan"),
	KRISHNA_SEVAKA("Krishna Sevaka"),
	KRISHNA_SADHAKA("Krishna Sadhaka"),
	KRISHNA_UPASAKA("Krishna Upasaka"),
	SRILA_PRABHUPADA_ASHRAYA("Srila Prabhupada Ashraya"),
	FIRST_INITIATED("First Initiated"),
	SECOND_INITIATED("Second Initiated");
	
	private final String sikshaLevel;
	
	private SikshaLevel(final String sikshaLevel) {
		this.sikshaLevel = sikshaLevel;
	}
	
	@Override
	public String toString() {
		return sikshaLevel;
	}
}
