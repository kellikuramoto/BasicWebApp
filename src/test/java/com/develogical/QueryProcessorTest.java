package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutBigHero() throws Exception {
        assertThat(queryProcessor.process("Big Hero"), containsString("Hiro Hamada"));
    }

    @Test
    public void teamName() throws Exception {
        assertThat(queryProcessor.process("name"), containsString("KelliLea"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void largestNum() {
        assertThat(queryProcessor.process("Which of the following numbers is the largest: 2020, 2021"), is("2021"));
    }

    @Test
    public void sum() {
        assertThat(queryProcessor.process("What is 2 plus 2"), is("4"));
    }

    @Test
    public void isCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("big hero"), is(""));
    }
    

    // @Test
    // public void knowsTeamName() throws Exception {
    //     assertThat(queryProcessor.process("what is your name"), containsString("MyTeam"));
    // }

}
