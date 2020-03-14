package com.hibernate.JPAusingAnnotations.JPAusingAnnotations;

import javax.persistence.*;
@Entity
@Table("emp100")

public class Employee 
{
@Id
private int id;
private String fname;
private String lname;

}
