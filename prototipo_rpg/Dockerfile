# Usa a imagem oficial do OpenJDK
FROM openjdk:17-alpine

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia TODOS os arquivos do projeto para dentro do container
COPY . .

# Verifica se os arquivos foram copiados corretamente (opcional para debug)
RUN ls -R /app

# Compila os arquivos Java corretamente e coloca os .class no diretório "bin"
RUN mkdir -p bin && javac -d bin $(find . -name "*.java")

# Define o comando padrão para rodar a aplicação corretamente
CMD ["java", "-cp", "bin", "prototipo_rpg.Main"]