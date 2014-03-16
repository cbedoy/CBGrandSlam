/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cb.models;

/**
 *
 * @author Carlos
 */
public class Trainer {
    private int id;
    private String name;
    private String initialDate;
    private String finalizeDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public String getFinalizeDate() {
        return finalizeDate;
    }

    public void setFinalizeDate(String finalizeDate) {
        this.finalizeDate = finalizeDate;
    }
}
