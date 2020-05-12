package com.matamercer.microblog.models.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "Follows")
@Getter
@Setter
public class Follow extends BaseModel {
    @OneToOne
    @JoinColumn(name = "follower_id")
    private User follower;

    @OneToOne
    @JoinColumn(name = "followee_id")
    private User followee;
}