package com.kash.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString

//@RequiredArgsConstructor
public class Link extends Auditable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String url;

    //comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();

    public Link() {
    }

        public Link(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
}
