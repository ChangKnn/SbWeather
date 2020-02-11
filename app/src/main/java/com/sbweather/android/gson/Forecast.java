package com.sbweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("tmp")
    public Tmp tmp;

    public class Tmp{

        @SerializedName("max")
        public String temperatureMax;

        @SerializedName("min")
        public String temperatureMin;
    }
}
