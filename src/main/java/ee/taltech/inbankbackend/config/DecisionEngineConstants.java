package ee.taltech.inbankbackend.config;

/**
 * Holds all necessary constants for the decision engine.
 */
public class DecisionEngineConstants {
    public static final Integer MINIMUM_LOAN_AMOUNT = 2000;
    public static final Integer MAXIMUM_LOAN_AMOUNT = 10000;
    public static final Integer MAXIMUM_LOAN_PERIOD = 60;
    public static final Integer MINIMUM_LOAN_PERIOD = 12;
    public static final Integer SEGMENT_1_CREDIT_MODIFIER = 100;
    public static final Integer SEGMENT_2_CREDIT_MODIFIER = 300;
    public static final Integer SEGMENT_3_CREDIT_MODIFIER = 1000;

    // expected life expectancies in Estonia, based on 2022 data
    // source: https://www.stat.ee/et/avasta-statistikat/valdkonnad/heaolu/tervis/oodatav-eluiga
    public static final Double MALE_AVG_LIFE_EXPECTANCY = 73.6;
    public static final Double FEMALE_AVG_LIFE_EXPECTANCY = 82.3;
}
