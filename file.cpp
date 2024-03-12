#include <iostream>
#include <time.h>
#include <unistd.h>

int main() {
        std::cout << "Message from cpp_file:" << std::endl;

        time_t system_time = time(0);
        std::string date_time = ctime(&system_time);

        std::cout << "Current day and time: " << date_time << "\n";
        std::cout << "Wait for 10 seconds...\n";
        sleep(10);
        std::cout << "Exit" << std::endl;

        return 0;
}
