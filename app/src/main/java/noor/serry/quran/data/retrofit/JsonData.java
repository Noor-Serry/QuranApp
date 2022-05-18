package noor.serry.quran.data.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class JsonData {




    @SerializedName("versesNumber")
        @Expose
        private int versesNumber;

    @SerializedName("data")
        @Expose
        private List<InnerDataInJson> data;

    public int getVersesNumber() {
        return versesNumber;
    }

    public void setVersesNumber(int versesNumber) {
        this.versesNumber = versesNumber;
    }

    public List<InnerDataInJson> getData() {
        return data;
    }

    public void setData(List<InnerDataInJson> data) {
        this.data = data;
    }
}