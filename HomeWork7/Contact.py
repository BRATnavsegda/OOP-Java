
class Contact:
    # String Name;
    # String Phone;
    # String City;

    def __init__(self, name, phone, city):
        self.Name = name
        self.Phone = phone
        self.City = city

        # MyLogger.logger.log(Level.INFO, "Создан новый контакт");

    def __str__(self):
        return f"Имя: {self.Name}  Телефон: {self.Phone}  Город: {self.City}"

    # public String getName() {
    #     return Name;
    # }
    #
    # public String getPhone() {
    #     return Phone;
    # }
    # public String getCity() {
    #     return City;
    # }
    # public void setName(String name) {
    #     Name = name;
    # }
    # public void setPhone(String phone) {
    #     Phone = phone;
    # }
    # public void setCity(String city) {
    #     City = city;
    # }