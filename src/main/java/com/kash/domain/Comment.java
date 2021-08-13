package com.kash.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Data
//@RequiredArgsConstructor
public class Comment extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String body;

    //link
    @ManyToOne
    @NonNull
    private Link link;

//    public Comment(@NonNull String body, @NonNull Link link) {
//        this.body = body;
//        this.link = link;
//    }
}
