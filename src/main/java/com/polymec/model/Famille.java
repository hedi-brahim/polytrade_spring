package com.polymec.model;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Version;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.EntityResult;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.List;
import com.google.common.collect.Lists;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "fml")
public class Famille implements Serializable {
    private Long id;
    private String designation;	
	private List<Article> articles = Lists.newArrayList();

	public Famille()
	{

	}
	
	public Famille(String des)
	{
		this.designation = des;
	}
	
    @Id	
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Fml_Num")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "Fml_le")
    public String getDesignation() {
		return designation;
    }

    public void setDesignation(String designation) {
		this.designation = designation;
    }

	@OneToMany(mappedBy="famille")
	private List<Article> getArticles()
	{
		return this.articles;
	}
	
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	
    @Override
    public String toString() {
        return "Famille - Id: " + id + ", Designation: " + designation;
    }
}
