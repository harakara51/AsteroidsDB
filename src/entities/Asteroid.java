package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scores")
public class Asteroid
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int score;
	private int kills;
	public Asteroid()
	{
		super();
	}
	public Asteroid(int id, String name, int score, int kills)
	{
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.kills = kills;
	}
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @return the score
	 */
	public int getScore()
	{
		return score;
	}
	/**
	 * @return the kills
	 */
	public int getKills()
	{
		return kills;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score)
	{
		this.score = score;
	}
	/**
	 * @param kills the kills to set
	 */
	public void setKills(int kills)
	{
		this.kills = kills;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Asteroid [id=" + id + ", name=" + name + ", score=" + score + ", kills=" + kills + "]";
	}
	
	

}
