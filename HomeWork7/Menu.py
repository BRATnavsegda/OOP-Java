from FilesWork import FilesWork
from Phonebook import Phonebook


class Menu:

    @staticmethod
    def main_menu():

        print("1 - Отобразить справочник")
        print("2 - Считать данные из файла")
        print("3 - Записать данные в файл")
        print("..........................")
        print("Выберите действие: ")
        cases = int(input())

        run = FilesWork()
        phones = Phonebook()
        phones.addressbook()
        match cases:
            case 1:
                phones.show_address_book()


            case 2:
                phones.addressbook()
                run.read_in(phones.pb)
                print("Export finish")
            case 3:
                phones.addressbook()
                run.write_in(phones.pb)
                phones.show_address_book()
        return None


#     MyLogger.logger.log(Level.INFO, "Запуск меню");
#     Scanner in = new Scanner(System. in);
#     System.out.println("1 - Отобразить справочник");
#     System.out.println("2 - Выгрузить данные");
#     System.out.println("3 - Загрузить данные");
#     System.out.println(". ".repeat(15) + ".");
#     System.out.print("Выберите действие: ");
#     int input = in.nextInt();
#
#     FilesWork run = new FilesWork();
#     Phonebook phones = new Phonebook();
#     phones.Addressbook();
#
#     switch(input)
#     {
#         case 1:   phones.showAddressBook();
#
#     break;
#     case  2:
#     phones.Addressbook();
#     run.save(phones.pb);
#     System.out.println("Export finish");
#     break;
#
#
# case 3:
# phones.Addressbook();
# run.load(phones.pb);
# phones.showAddressBook();
# break;
