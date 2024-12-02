FROM python:3.11-slim

WORKDIR /mnt/c/pliki/repo/Programs_Generation/src

COPY requirements.txt .

RUN pip install --no-cache-dir -r requirements.txt

COPY . .

ENTRYPOINT ["python", "main.py"]

CMD []
