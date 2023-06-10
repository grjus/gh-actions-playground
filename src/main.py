import os


def write_string_to_file(file_name, string):
    dir_path = '../resources'
    if not os.path.exists(dir_path):
        # create directory if it does not exist
        os.makedirs(dir_path)

    # create file path
    file_path = os.path.join(dir_path, file_name)
    with open(file_path, 'w') as f:
        f.write(string)

if __name__ == "__main__":
    write_string_to_file('log.txt', 'Message from another branch')