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
public class Award {
    private int id;
    private float amount;
    private float category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getCategory() {
        return category;
    }

    public void setCategory(float category) {
        this.category = category;
    }
}
