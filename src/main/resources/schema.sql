CREATE TABLE IF NOT EXISTS list (
                                      id SERIAL NOT NULL,
                                      name VARCHAR(256) NOT NULL,
                                      details VARCHAR(256) NOT NULL,
                                      PRIMARY KEY (id)
);