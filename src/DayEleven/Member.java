package DayEleven;

// !Member class - High cohesion: only manages member data
// !Cohesion: A module (class/method) shld hv a single, focused purpose with closely related responsibilities.
public class Member {
    private String name;
    private String memberId;


    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }
}
