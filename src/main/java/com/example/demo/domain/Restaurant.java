package com.example.demo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(exclude = {"menuLists"})
@Getter
@NoArgsConstructor
@Table(name = "table_restaurant")
@Entity
public class Restaurant extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "restaurant")
    private List<Menu> menuLists;

    public Restaurant (final String name) {
        this.name = name;
    }

    public void addMenu(final Menu menu) {
        this.menuLists.add(menu);
    }
}
