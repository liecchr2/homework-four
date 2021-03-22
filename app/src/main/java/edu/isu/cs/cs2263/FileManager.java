package edu.isu.cs.cs2263;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileManager {
        //Instance variables
        private ArrayList<User> users = new ArrayList<>();

        //Empty constructor
        public FileManager() {}

        public void writeFile(String file, User[] data) throws IOException {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            FileWriter writer = new FileWriter(file);

            gson.toJson(data, writer);
            writer.close();
        }

        public ArrayList<User> readFile(String file) throws IOException {
            Gson gson = new Gson();
            ArrayList<User> other = new ArrayList<>();
            Reader reader = Files.newBufferedReader(Paths.get(file));
            //Create Type for ArrayList
            Type arrayList = new TypeToken<ArrayList<User>>() {}.getType();
            other = gson.fromJson(reader, arrayList);
            reader.close();
            return other;
        }

}
