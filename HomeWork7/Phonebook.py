from Contact import Contact


class Phonebook:

    def __init__(self):
        self.pb = []

    def addressbook(self):

        self.pb.append(Contact("Иванов Иван Иванович", "1234567890", "Иваново"))

    def show_address_book(self):
        for i in self.pb:
            print(i.Name + " " + i.Phone + " " + i.City)
