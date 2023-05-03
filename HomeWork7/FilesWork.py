import csv


class FilesWork:

    def __init__(self):
        self.__file = "export.csv"  # файл по умолчанию

    @property
    def file(self):
        return self.__file

    @file.setter
    def file(self, file):
        self.__file = file

    def write_in(self, file, input_data):  # записать в файл
        with open(file, 'w', encoding='utf-8', newline='') as data:
            writer = csv.writer(data)
            for row in input_data.items():
                writer.writerow(row)

    def read_in(self, file):  # считать из файла
        res = {}
        with open(file, 'r', encoding='utf-8') as data:
            for count, name_number in csv.reader(data):
                res[count] = name_number
            return res

    def add_in(self, file, input_data):  # добавить строку в файл
        f = open(file, 'r')
        s = f.read()
        f.close()
        l = s.splitlines()
        l.insert(0, str(input_data))
        s = '\n'.join(l)
        f = open(file, 'w')
        f.write(s)
        f.close()
