package com.iqbal.finalapp;

import java.util.ArrayList;

public class MusicalInstrumentData {

    private static String[] instrumentNames = {
            "Gitar",
            "Harpa",
            "Sasando",
            "Saxophone",
            "Sampe",
            "Rebab",
            "Siter & Celempung",
            "Piano",
            "Pianika",
            "Biola"
    };

    private static String[] instrumentDetails = {
            "Gitar merupakan alat musik berdawai yang dimainkan dengan cara dipetik dengan jari atau bisa menggunakan alat bantu plektrum atau plektra. Gitar terdiri dari 6 tali senar (yang terbuat dari nilon/baja). Bagian inilah yang dapat menghasilkan nada-nada yang harmonis jika dipetik dengan aturan kunci nada tertentu. Gitar tradisional biasanya terbuat dari kayu, sedangkan material polikarbonat digunakan untuk gitar modern. Ada 2 jenis gitar yaitu elektrik dan akustik.",
            "Harpa (Harp) merupakan alat musik petik. Harpa juga memiliki senar, dan bentuknya tinggi. Harpa triangular biasanya merupakan harpa modern dengan ukuran 60 cm-180 cm, dengan senar 22-47 buah. Saat memainkan harpa ada yang bisa di pangku (ukuran kecil) dan ada yang diletakkan di lantai (ukuran besar). Sebenarnya harpa banyak variasi ukurannya dibandingkan dengan instrumen lain. Suara yang dihasilkan dari harpa begitu halus, dan lebih sering dimainkan solo, namun juga bisa digunkan sebagai musik pengiring (ansambel).",
            "Alat musik ini memiliki nama sasando. Alat musik ini berasal dari Nusa Tenggara Timur (NTT) tepatnya di pulau Rote. Sasandu berarti alat yang berbunyi /bergetar (dalam bahasa rote). Sasando biasanya terbuat dari bambu, dengan bentuk tabung panjang (bagian utama). Tempat dari senarnya berada pada bagian tengah. tabung sasando terdiri dari anyaman daun lontar berbentuk kipas yang digunakan sebagai tempat resonansi.",
            "Saxophone berasal dari negara Belgia yang dibuat oleh Adolphe Sax. Saxophone merupakan alat musik tiup sambil menekan tuts/lubang dengan aturan nada tertentu sehingga menghasilkan suara yang indah. Instrumen ini sering digunakan dalam musik jazz, big and music, musik pop. Biasanya terbuat dari logam. Alto (Eb), Baritone (Eb), Soprano (Bb), dan Tenor (Bb) merupakan jenis sexophone yang sering digunakan.",
            "Sampe merupakan alat musik yang berasal dari suku Dayak di Kalimantan Timur. Instrumen ini dimainkan dengan cara dipetik, terbuat dari bahan kayu (biasanya kayu marang, kayu tabalok, kayu pelantan, kayu adau, dll). Senar/dawai pada zaman dulu menggunakan tali dari pohon aren atau pohon enau. Pada zaman sekarng sudah menggunakan kawat tipis sehingga menghasilkan bunyi yang nyaring.",
            "Rebab/robab/rubab merupakan instrumen yang berasal dari Timur Tengah. Alat ini masuk ke Indonesia melaui pedangan-pedangan Islam. Alat musik senar ini dimainkan dengan cara digesek. Ukurannya kecil, dengan badan bulat, leher rebab panjang. Tidak memiliki papan nada dan penggunaannya bisa di pangku atau diletakkan dilantai. Mirip seperti biola namun busurnya lebih melengkung.",
            "Siter dan celempung merupakan alat musik dalam gamelan jawa yang dimainkan dengan cara dipetik, pada kedua sisi diantara kotak resonator ada senar sebanyak 11 dan 13 pasang. Panjang siter 30 cm sedangkan celempung 90 cm dengan 4 kaki serta ada satu oktaf yang disetel dibawah siter. Nada pelog disetel pada satu senar sedangkan nada slendro untuk senar yang lainnya yang merupakan ciri khasnya. Cara memainkan siter dan celempung dilakukan dengan tempo yang sama.",
            "Piano juga merupakan salah satu alat musik yang sering kita jumpai, cara memainkan alat ini ialah dengan menekan tuts pada piano dengan kepiawaian jari-jemari seorang pianis sehingga menghasilkan nada yang indah. Piano dibagi menjadi: piano elektronik dan piano akustik. Perbedaannya yaitu pada piano elektronik untuk menghasilkan bunyi memakai papan elektronik sedangkan pada piano akustik memakai senar melalui tangan seorang hammer.",
            "Pianika adalah alat musik yang hampir mirip dengan piano, letak perbedaannya ialah pada pianika memiliki pipa yang dihubungkan ke mulut sebagai penyalur udara agar menghasilkan bunyi dari tiupan nafas sambil menekan tuts. Dalam memainkan alat pianika dibutuhkan teknik pernafasan yang baik. Ukuran dari pianika juga lebih kecil dibandingkan dengan piano.",
            "Alat musik ini adalah alat musik dawai yang memiliki empat senar yaitu G-D-A-E yang dimainkan dengan cara digesek. Senar G merupakan nada paling rendah. Biola dengan nada tinggi yaitu cello, biola alto, kontra bass atau double bass. Hampir semua kertas musik untuk instrumen biola ini menggunakan kunci G."
    };

    private static int[] instrumentImages = {
            R.drawable.guitar,
            R.drawable.harpa,
            R.drawable.sasando,
            R.drawable.saxophone,
            R.drawable.sampe,
            R.drawable.rebab,
            R.drawable.siter_celempung,
            R.drawable.piano,
            R.drawable.pianika,
            R.drawable.biola
    };

    static ArrayList<MusicalInstrument> getListData() {
        ArrayList<MusicalInstrument> list = new ArrayList<>();
        for (int position = 0; position < instrumentNames.length; position++) {
            MusicalInstrument musicalInstrument = new MusicalInstrument();
            musicalInstrument.setName(instrumentNames[position]);
            musicalInstrument.setDetail(instrumentDetails[position]);
            musicalInstrument.setPhoto(instrumentImages[position]);
            list.add(musicalInstrument);
        }
        return list;
    }

}
