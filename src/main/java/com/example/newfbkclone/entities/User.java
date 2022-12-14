package com.example.newfbkclone.entities;

import lombok.*;
import org.hibernate.annotations.Cascade;
//import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;



@Getter
@Setter
//@Builder
@ToString
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="users")
@Entity(name = "user")
public class User implements Serializable {


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

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 50,nullable = false)
    private String uuid;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @PrePersist
    public void setCreatedAt() {
        createdAt = new Date();
    }

    @PreUpdate
    public void setUpdatedAt() {
        updatedAt = new Date();
    }

    @OneToMany(mappedBy = "user")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Post> userPost;


    @OneToMany(mappedBy = "user")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Comment> userComment;
}
