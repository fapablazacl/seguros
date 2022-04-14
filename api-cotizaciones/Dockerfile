FROM node

RUN mkdir /node
ADD dist /node/dist
ADD package.json /node
WORKDIR /node
RUN npm install --prod 

# Ejecucion
EXPOSE 3000
CMD node dist/main
