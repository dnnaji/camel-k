from('timer:tick?period=3000')
  .setBody().constant('Hello Camel K!')
  .to('log:info')
