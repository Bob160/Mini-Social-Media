package com.example.newfbkclone.entities;

import lombok.*;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Date;



@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users_table")
public class User {


    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,nullable = false)
    private String firstname;

    @Column(length = 50,nullable = false)
    private String lastname;

    @Column(length = 50,nullable = false)
    private String username;

    @Column(length = 50,nullable = false)
    private String password;

    @Column(length = 50,nullable = false)
    private String uuid;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;


    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

}
