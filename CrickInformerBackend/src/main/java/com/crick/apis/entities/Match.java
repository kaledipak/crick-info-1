package com.crick.apis.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "crick_matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String teamHeading;
    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;
    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date=new Date();

//    public void setMatchStatus() {
//        if (this.textComplete.trim().isBlank()) {
//            this.status = MatchStatus.LIVE;
//        } else {
//            this.status = MatchStatus.COMPLETED;
//        }
//    }

}
