package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/25/20173:15 PM.
 */
public interface VisionGlobalConstants {
    public static final String EMPTY_STRING = "";
    public static final String EURO = "euro";
    public static final String WH = "wh";
    public static final String[] PREFIX_KEY = {"", "k", "m", "g", "t"};

    public static final String DS_REQUEST_KEYWORD_MATCHING = "matching";
    public static final String DS_REQUEST_KEYWORD_FETCH = "fetch";
    public static final String HTTP_CREATED = "201";
    public static final String HTTP_BAD_REQUEST = "400";
    public static final String HTTP_OK = "200";
    public static final String FORWARD_SLASH = "/";
    public static final String ALL = "ALL";

    public static final String COMMA = ",";
    public static final String UNDER_SCORE = "_";
    public static final String FLUIDE = "fluide";
    public static final String ENERGY_QUANTITY = "energyQuantity";
    public static final String ENERGY_UNIT= "energyUnit";
    public static final String ENERGY_PERCENT = "energyPercent";
    public static final String EMISSION_QUANTITY = "emissionQuantity";
    public static final String EMISSION_UNIT = "emissionUnit";
    public static final String COST_RECOG_SIGN = "cost_";
    public static final String EMISSION_CO2_RECOG_SIGN = "ghg_";
    public static final String EMISSION_CO2 = "emissionCO2";
    public static final String FOURNITURE_DENERGIE = "fournitureDenergie";
    public static final String CONSO_RECOG_SIGN = "conso_";
    public static final String CONSO_QUANTITY = "consoQuantity";
    public static final String CONSO_UNIT = "consoUnit";
    public static final String CONTRACT_ACTIVE_RECOG_SIGN = "pdl_";
    public static final String CONTRACTS_ACTIVE = "contractsActive";
    public static final String COST = "cost";
    public static final String CONSO = "conso";
    public static final String COST_UNIT = "costUnit";
    public static final String AVERAGE_COST = "averageCost";
    public static final String PARTNER_ID = "partner_id";
    public static final String TIME_STAMP = "timestamps";
    public static final String SITE_ID = "site_id";
    public static final String WATER = "water";
    public static final String FOURNITURE_DEAU = "fournitureDeau";
    public static final String TOTAL_ENERGY = "energy";
    public static final String COST_BY_CONSO = "costbyconso";
    public static final String COST_BY_CONSO_UNIT = "costByConsoUnit";
    public static final String EMPTY_ARRAY = "[]";
    public static final String POWER_COEFFICIENCY = "powerCoefficiency";
    public static final String OTHER_ENERGY = "other_energy";
    public static final String T_CO2 = "tco2";
    public static final String WH_UNIT = "wh";
    public static final String HISTORY = "History";
    public static final String PARTNER = "partner";
    public static final String START_DATE = "start_date";
    public static final String END_DATE = "end_date";
    public static final String DELIVERY_POINT = "delivery_point";
    public static final String DATA = "data";
    public static final String SUCCESS = "success";
    public static final String DASH = "-";
    public static final String VALUE = "value";
    public static final String UNIT = "unit";
    public static final String CODE ="code" ;
    public static final String SITE = "site";

    public static final String[] FLUIDE_ARRAY_FROM_FRAME = {"naturel", "gaz naturel", "gaz-naturel", "gaz", "gas",
            "vapeur", "steam", "elec", "eau","water", "fioul", "fol", "gaz propane", "propane", "gaz-propane", "reseau de chaleur",
            "heat", "wood", "lpg", "coal", "other_energy", "energy"};
    public static final String[] FLUIDE_ARRAY_COLOR_CLASS = {"gaz-naturel", "gaz-naturel", "gaz-naturel", "gaz-naturel", "gaz-naturel",
            "vapeur", "steam", "elec", "water", "water", "fioul", "fol", "gaz-propane", "gaz-propane", "gaz-propane", "reseau-de-chaleur",
            "heat", "wood", "lpg", "coal", "other-energy", "energy"};

    public static final Integer[] PREFIX_VALUE = {10^0, 10^3, 10^6, 10^9, 10^12};

    public static final String INVOICING_VISION_GLOBAL = "invoicing_vision_global";
    public static String[] getFluideArrayFromName(){
        return FLUIDE_ARRAY_FROM_FRAME;
    }

    public static String[] getFluideArrayColorClass(){
        return FLUIDE_ARRAY_COLOR_CLASS;
    }

    public static String[] getPrefixKey(){
        return PREFIX_KEY;
    }

    public static Integer[] getPrefixValue(){
        return PREFIX_VALUE;
    }
}
