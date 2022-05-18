package noor.serry.quran.data.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class InnerDataInJson {



        @SerializedName("verse_pk")
        @Expose
        private String versePk;
        @SerializedName("page")
        @Expose
        private Integer page;
        @SerializedName("hizbQuarter")
        @Expose
        private Integer hizbQuarter;
        @SerializedName("juz")
        @Expose
        private Integer juz;
        @SerializedName("surah")
        @Expose
        private String surah;
        @SerializedName("verse")
        @Expose
        private String verse;
        @SerializedName("verseWithoutTashkeel")
        @Expose
        private String verseWithoutTashkeel;
        @SerializedName("numberInSurah")
        @Expose
        private Integer numberInSurah;
        @SerializedName("numberInQuran")
        @Expose
        private Integer numberInQuran;
        @SerializedName("audio")
        @Expose
        private String audio;
        @SerializedName("audio1")
        @Expose
        private String audio1;
        @SerializedName("audio2")
        @Expose
        private String audio2;
        @SerializedName("sajda")
        @Expose
        private Boolean sajda;

        public String getVersePk() {
            return versePk;
        }

        public void setVersePk(String versePk) {
            this.versePk = versePk;
        }

        public InnerDataInJson withVersePk(String versePk) {
            this.versePk = versePk;
            return this;
        }

        public Integer getPage() {
            return page;
        }

        public void setPage(Integer page) {
            this.page = page;
        }

        public InnerDataInJson withPage(Integer page) {
            this.page = page;
            return this;
        }

        public Integer getHizbQuarter() {
            return hizbQuarter;
        }

        public void setHizbQuarter(Integer hizbQuarter) {
            this.hizbQuarter = hizbQuarter;
        }

        public InnerDataInJson withHizbQuarter(Integer hizbQuarter) {
            this.hizbQuarter = hizbQuarter;
            return this;
        }

        public Integer getJuz() {
            return juz;
        }

        public void setJuz(Integer juz) {
            this.juz = juz;
        }

        public InnerDataInJson withJuz(Integer juz) {
            this.juz = juz;
            return this;
        }

        public String getSurah() {
            return surah;
        }

        public void setSurah(String surah) {
            this.surah = surah;
        }

        public InnerDataInJson withSurah(String surah) {
            this.surah = surah;
            return this;
        }

        public String getVerse() {
            return verse;
        }

        public void setVerse(String verse) {
            this.verse = verse;
        }

        public InnerDataInJson withVerse(String verse) {
            this.verse = verse;
            return this;
        }

        public String getVerseWithoutTashkeel() {
            return verseWithoutTashkeel;
        }

        public void setVerseWithoutTashkeel(String verseWithoutTashkeel) {
            this.verseWithoutTashkeel = verseWithoutTashkeel;
        }

        public InnerDataInJson withVerseWithoutTashkeel(String verseWithoutTashkeel) {
            this.verseWithoutTashkeel = verseWithoutTashkeel;
            return this;
        }

        public Integer getNumberInSurah() {
            return numberInSurah;
        }

        public void setNumberInSurah(Integer numberInSurah) {
            this.numberInSurah = numberInSurah;
        }

        public InnerDataInJson withNumberInSurah(Integer numberInSurah) {
            this.numberInSurah = numberInSurah;
            return this;
        }

        public Integer getNumberInQuran() {
            return numberInQuran;
        }

        public void setNumberInQuran(Integer numberInQuran) {
            this.numberInQuran = numberInQuran;
        }

        public InnerDataInJson withNumberInQuran(Integer numberInQuran) {
            this.numberInQuran = numberInQuran;
            return this;
        }

        public String getAudio() {
            return audio;
        }

        public void setAudio(String audio) {
            this.audio = audio;
        }

        public InnerDataInJson withAudio(String audio) {
            this.audio = audio;
            return this;
        }

        public String getAudio1() {
            return audio1;
        }

        public void setAudio1(String audio1) {
            this.audio1 = audio1;
        }

        public InnerDataInJson withAudio1(String audio1) {
            this.audio1 = audio1;
            return this;
        }

        public String getAudio2() {
            return audio2;
        }

        public void setAudio2(String audio2) {
            this.audio2 = audio2;
        }

        public InnerDataInJson withAudio2(String audio2) {
            this.audio2 = audio2;
            return this;
        }

        public Boolean getSajda() {
            return sajda;
        }

        public void setSajda(Boolean sajda) {
            this.sajda = sajda;
        }

        public InnerDataInJson withSajda(Boolean sajda) {
            this.sajda = sajda;
            return this;
        }


}
