package barcelona.dao.model;

import javax.persistence.*;

@Entity
@Table(name = "Player")
public class Player {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "number")
    private int number;
    @Column(name = "role")
    private String role;

    public Player(){
    }

    public Player(String name, String lastName, int number, String role) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
        this.role = role;
    }

    /**
     * Gets id.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the new value.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the new value.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets lastName.
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets LastName.
     *
     * @param lastName the new value.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets number.
     *
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets number.
     *
     * @param number the new value.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Gets role.
     *
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the new value.
     */
    public void setRole(String role) {
        this.role = role;
    }
}
