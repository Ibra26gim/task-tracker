package ru.ibra.tasktracker.tasktracker.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "task_card")
public class TaskCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_card_id")
    private Long taskId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "email")
    private String email;

    @Column(name = "began_time")
    private LocalDateTime beganTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "spended_time_in_minutes")
    private Integer spendedTimeInMinute;

    @JsonManagedReference
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_task_id", referencedColumnName = "card_id")
    private UserCardEntity userCardEntity;
}
