package org.phonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;

public class  FilesWork extends Filemanager implements saveData, loadData{
    String FILE_PATH = "./src/main/java/org/phonebook/";
    String FILE_NAME = "export.csv";
    String FILE_PATH_FULL = FILE_PATH+ FILE_NAME;

    public FilesWork() throws IOException {
    }

    public void save(ArrayList<Contact> pb){
        MyLogger.logger.log(Level.INFO, "Запись данных в файл");
        try(FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME, false))
        {
            // запись всей строки

            for(Contact i: pb){
                String text = i.getName()+";"+i.getPhone()+";"+i.getCity();
                writer.write(text);
                // запись по символам
                writer.append('\n');
//                writer.append('E');
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }


    public void load(ArrayList<Contact> pb){
        MyLogger.logger.log(Level.INFO, "Чтение данных из файла");
        try {
            File file = new File(FILE_PATH_FULL);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
//                System.out.println(line);

                String[] tmp = line.split(";");

                pb.add(new Contact(tmp[0], tmp[1], tmp[2]));
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
