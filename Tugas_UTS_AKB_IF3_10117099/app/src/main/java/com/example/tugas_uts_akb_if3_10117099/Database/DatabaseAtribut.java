package com.example.tugas_uts_akb_if3_10117099.Database;

import android.provider.BaseColumns;

/** NIM : 10117099
 * Nama : I Gusti Glen Joyo Diningrat Wiyono
 * Kelas : IF 3
 * Tanggal : 13-05-2020**/
public class DatabaseAtribut {
    static String TABLE_NAME = "friend";

    public static final class NoteColumns implements BaseColumns {
        public static String NIM = "nim";
        public static String NAMA = "nama";
        public static String KELAS = "kelas";
        public static String TELPON = "telpon";
        public static String EMAIL = "email";
        public static String Facebook = "fb";
        public static String DATE = "date";
    }
}
