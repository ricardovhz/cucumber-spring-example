package com.vanhoz.ricardo.cucumberdemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class StepDefs extends SpringTest {

    @Autowired
    private MyBean bean;

    private int total;

    @Given("o preco de {string} é {int}")
    public void o_preco_de_é(String produto, Integer preco) {
        bean.givePrices(produto, preco);
    }

    @When("eu faço o checkou de {int} {string}")
    public void eu_faço_o_checkou_de(Integer qtd, String produto) {
        this.total = bean.calculate(produto, qtd);
    }

    @Then("o preco total de {string} deve ser {int}")
    public void o_preco_total_deve_ser(String produto, Integer total) {
        Assert.assertEquals((int) total, this.total);
    }
}
