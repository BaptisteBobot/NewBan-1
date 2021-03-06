package Models;

import java.sql.Timestamp;

public class Advisors extends BaseModelORM {
    Integer id;

    String tableName = "advisors";
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Boolean is_enabled = true;
    private String type_advisor;
    private String roles;


    public String getTableName() {
        return tableName;
    }

    public String getLastName() {
        return lastName;
    }

    public Advisors setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Advisors setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public Advisors setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Advisors setPassword(String password) {
        this.password = password;
        return this;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Advisors setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
        return this;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public Advisors setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public Advisors setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
        return this;
    }

    public String getRoles() {
        return roles;
    }

    public Advisors setRoles(String roles) {
        this.roles = roles;
        return this;
    }
    public String getType_advisor() {
        return type_advisor;
    }

    public Advisors setType_advisor(String type_advisor) {
        this.type_advisor = type_advisor;
        return this;
    }
}