FROM ubuntu

USER 0

RUN apt update -y && apt install build-essential -y

CMD ["echo", "Hello from dockerfile"]
