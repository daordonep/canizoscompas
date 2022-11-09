package com.dharian.microservice.entidades.bbdd;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

import java.sql.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "data")
public class Datum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @MapsId("id")
    private Usuario user;

    @Column(name = "veces", nullable = false)
    private Integer veces;

    @Column(name = "fecha", nullable = false)
    private Date fecha;



}