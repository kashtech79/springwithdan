package com.kash.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Data
public class Link {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

    //comments

}
