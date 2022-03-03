package com.monster.records.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class monster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String creature;
	private int challenge_rating;
	private String monster_type;
	private String size;
	private int armor_class;
	private long health;
	private String alignment;
	private boolean is_legendary;
	private String portrait;
	public monster() {
		super();
	}
	public monster(int id, String creature, int challenge_rating, String monster_type, String size, int armor_class,
			long health, String alignment, boolean is_legendary,
			String portrait) {
		super();
		this.id = id;
		this.creature = creature;
		this.challenge_rating = challenge_rating;
		this.monster_type = monster_type;
		this.size = size;
		this.armor_class = armor_class;
		this.health = health;
		this.alignment = alignment;
		this.is_legendary = is_legendary;
		this.portrait = portrait;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreature() {
		return creature;
	}
	public void setCreature(String creature) {
		this.creature = creature;
	}
	public int getChallenge_rating() {
		return challenge_rating;
	}
	public void setChallenge_rating(int challenge_rating) {
		this.challenge_rating = challenge_rating;
	}
	public String getMonster_type() {
		return monster_type;
	}
	public void setMonster_type(String monster_type) {
		this.monster_type = monster_type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getArmor_class() {
		return armor_class;
	}
	public void setArmor_class(int armor_class) {
		this.armor_class = armor_class;
	}
	public long getHealth() {
		return health;
	}
	public void setHealth(long health) {
		this.health = health;
	}
	
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public boolean isIs_legendary() {
		return is_legendary;
	}
	public void setIs_legendary(boolean is_legendary) {
		this.is_legendary = is_legendary;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	
	
	
	
}
